import { useEffect , useState} from "react"
import Choose from "./Choose";
import OneSign from "./OneSign";
export default function Sign({day, month}){
    const [signs, setSigns] = useState([{}]);
    useEffect(()=>{
            fetch(`http://localhost:8880/sign?day=${day}&month=${month}`, {method:"GET", cors:"no-cors"})
            .then(async (res) => await res.json()
            ).then((data) =>{
                    setSigns(data);
                },
                (errors)=>{
                    console.log(errors);
                }
            )
    },[]);
    return(
        <div className="w-[100vw] min-h-screen">
            {signs.length == 1 ? <OneSign sign = {...signs[0]}/> : <Choose signs= {signs}/>}
        </div>
    )
}