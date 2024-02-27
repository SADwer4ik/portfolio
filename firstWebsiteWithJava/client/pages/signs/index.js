import { useParams, useSearchParams } from "next/navigation";
import { useEffect, useState } from "react";
import OneSign from "../OneSign";

export default function ChooseSign(){
    const [sign, setSign] = useState({});
    useEffect(() =>{
    const params = new URLSearchParams(window.location.search);
    const name = params.get('name');
    fetch(`http://localhost:8880/sign/find?name=${name}`, {method:"GET", cors:"no-cors"})
    .then(async (res) => await res.json()
    ).then((data) =>{
            setSign(data);
        },
        (errors)=>{
            console.log(errors);
        }
    )
    },[]);
    return(
        <div className={`bg-[${sign.bgColor}]`}>
            <OneSign sign={sign} />
        </div>
    )
}