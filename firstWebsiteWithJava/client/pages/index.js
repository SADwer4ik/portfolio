import { useState } from "react";
import HomePage from "./HomePage";
import Sign from "./Sign";
export default function Home(){
    const [day, setDay] = useState(1);
    const [month, setMonth] = useState(1);
    const [flag, setFlag] = useState(false);
    return(
        <div>
            {flag ? <Sign day={day} month={month} /> : <HomePage setDay={setDay} setMonth={setMonth} setFlag={setFlag}/>}
        </div>
    )
}