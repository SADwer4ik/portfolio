export default function OneSign({sign}){
    let neighbour = []
    let styles = {};
    let secondStyle ={}
    if(sign.neighbours != undefined){
        neighbour = sign.neighbours.split(" ");
    }
        styles = {
            background: sign.bgColor,
            color: sign.bgColor
        }
    return(
        <div className="w-[100%] min-h-[100vh] bg-gradient-to-r
        flex justify-center gap-[10vw] items-center
         from-cyan-500 to-indigo-600 text-white
         tracking-wider font-bold" style={styles}>
            <div className="absolute min-w-[10vw] px-[30px] h-[10vw] top-[5vh] right-[5vw]
             rounded-full bg-black flex invert
            justify-center items-center shadow-xl rounded-r-lg text-[2em]
            ">
                {sign.rusName}
            </div>
            <div className="absolute px-[20px] py-[10px] text-[3em] bottom-[5vh] left-[10vw]
             rounded-full bg-black flex
            justify-center items-center shadow-xl rounded-tr-lg invert
            ">
                <h2 className="" style={secondStyle}>{sign.rusElement}</h2>
            </div>
            <div className="absolute px-[20px] py-[10px] text-[3em] top-[5vh] left-[10vw]
             rounded-full bg-black flex invert
            justify-center items-center shadow-xl rounded-tl-lg
            ">
                <h2 className="" style={secondStyle}>{sign.quality}</h2>
            </div>
            <ul className="flex flex-col invert justify-start p-[20px] gap-[20px] rounded-[30px] items-center w-[20vw] h-[50vh] bg-black shadow-xl mt-[5vh]">
                <li className="mb-[20px]"><h2>Соседи</h2></li>
                {neighbour.map((neigb) =>{
                    return(
                        <li className="w-[100%] invert flex justify-center items-center"><a href={`http://localhost:3000/signs?name=${neigb}`}
                         className="block w-[90%] px-[20px] rounded-[20px]
                         py-[10px] hover:bg-black hover:shadow-2xl duration-300 invert flex justify-center items-center hover:tracking-[5px]
                        ">{neigb}</a></li>
                    )
                })}
            </ul>
                        <div className="absolute px-[20px] py-[10px] text-[1.5em] top-[5vh] left-[50vw]
             rounded-full bg-black flex
            justify-center items-center shadow-xl rounded-tr-lg
            ">
                <h2 className="invert" style={secondStyle}>{sign.date}</h2>
            </div>
            <div className="flex flex-col justify-start
            overflow-hidden invert
            p-[20px] gap-[20px] rounded-[30px] items-center w-[40vw] h-[50vh] bg-black shadow-xl mt-[5vh]">
                <h2>Описание:</h2>
                <p>{sign.description}</p>
            </div>
            <div className="absolute px-[20px] py-[10px] text-[2em] bottom-[5vh] right-[5vw]
             rounded-full flex invert
            justify-center items-center shadow-xl hover:shadow-2xl
            ">
                <a className="" href="http://localhost:3000">Reset</a>
            </div>
            <div className="absolute px-[20px] py-[10px] text-[1.5em] bottom-[5vh] right-[30vw]
             rounded-full bg-black flex
            justify-center items-center shadow-xl hover:shadow-2xl invert
            ">
                <a className="" href="http://localhost:3000/choose">Посмотреть все знаки</a>
            </div>

        </div>
    )
}