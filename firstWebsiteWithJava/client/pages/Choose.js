import WhiteSide from "./WhiteSide"
import BlackSide from "./BlackSide"
import { useEffect, useState } from "react"
export default function Choose({signs}){
    const [styles, setStyles] = useState({});
    useEffect(()=>{
    let st = {
        background: "linear-gradient(signs[0].color, signs[1].color)",
    }
    setStyles(st);
    },[])
    return(
        <div className="w-[100%] min-h-[100vh] flex justify-between items-center
         bg-gradient-to-r from-violet-500 to-fuchsia-500" style={styles}>
            <h1 className="absolute text-white top-[5vh] left-[35vw] text-[2.5em]"> Выбери свой путь!</h1>
            <WhiteSide sign={signs[0]} />
            <BlackSide sign={signs[1]} />
            <a className="absolute bottom-[5vh] left-[40vw] text-white text-[2em]" href="http://localhost:3000/choose">Посмотреть все знаки</a>
        </div>
    )
}