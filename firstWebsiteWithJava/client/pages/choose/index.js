import { useState } from "react";
export default function AllSigns(){
    const signs = ["Весы", "Близнецы", "Дева", "Рак", "Скорпион",
     "Рыбы", "Лев", "Овен", "Стрелец", "Телец", "Козерог", "Водолей"];
     const [iterator, setIterator] = useState(0);
    return(
        <dvi className="choose_all">
            <div className="w-[50vw] flex gap-[30px] h-[50vw] flex-wrap p-[30px]">
                {signs.map((sign) =>{
                    return(
                    <a className=""
                    href={`http://localhost:3000/signs?name=${sign}`}>{sign}</a>
                    )
                })}
            </div>
        </dvi>
    )
}