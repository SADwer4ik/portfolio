import './css/app.css';
import React from 'react';
function App() {
   const symbolO = "O"
   const symbolX = "X"
   const [cells, setCells] = React.useState([null, null, null, null, null, null, null, null, null]);
   const [currentStep, setCurrentStep] = React.useState(symbolX);
   const [winners, setWinners] = React.useState(null);
   const [gameState, setGameState] = React.useState(false);
   const [gameCount, setGameCount] = React.useState(0);
   let handleCellClick = (index) => { 
      gameOver();
      if((cells[index] !== null) || (gameState)) {
         return;
      }

      let cellsCopy = [...cells];
      cellsCopy[index] = currentStep;
      let winner = winnerCheck(cellsCopy);
      setGameCount(gameCount + 1);
      setCells(cellsCopy);
      setWinners(winner);
      setCurrentStep(currentStep === symbolO ? symbolX : symbolO);
   }
   let winnerCheck = (cells) =>{
      let win = [
         [0, 1, 2],
         [3, 4, 5],
         [6, 7, 8],
         [0, 3, 6],
         [1, 4, 7],
         [2, 5, 8],
         [0, 4, 8],
         [6, 4, 2]
      ]
      for (let i = 0; i<win.length; i++){
         let [a, b, c] = win[i];
         if (cells[a] && cells[a] === cells[b] && cells[a] === cells[c]){
               return [a, b, c]
            }
      }
      return null;
   }
   let gameOver = () =>{
      if (winners !== null){
         setGameState(true);
      }
      if (gameCount === 9){
         setGameState(true)
      }
   }
   let newGame = () =>{
      let cellsCopy = cells;
      setCells(cellsCopy.map(() =>{return null}))
      setGameState(false);
      setCurrentStep(symbolX);
      setGameCount(0);
      setWinners(null);
   }
   let endGame = () => {
      if ((gameState) && (winners !== null)){
         let a = ''
         currentStep === symbolO ? a =  "Победил O" : a =  'Победил X'
         return a;
      }
      if  (gameCount === 9){
         return "Ничья"
      }
      return `Next move: ${currentStep}`
   }
  return (
    <div className="wrapper">
      {
         <div className={`game-info game-info${currentStep}`}>{endGame()}</div>
      }
      <div className="game-field">
        {
            cells.map((c, index) =>{
               return <a 
                  key={index} 
                  onClick = {() => {handleCellClick(index)}} 
                  href="#" className={c===null ? "cell" : `cell cell${c}`}>
                  {c}
               </a>
            })
         }
    </div>
    <a onClick={newGame} href="#" className="newGame-btn">Новая Игра</a>
    </div>
  );
}
export default App;
