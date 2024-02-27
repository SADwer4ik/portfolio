import { useState } from "react";
import DatePicker from "react-datepicker";
import "react-datepicker/dist/react-datepicker.css";

export default function HomePage({setDay, setMonth, setFlag}) {
  const [date, setDate] = useState(new Date());
  function setLayout(){
    if(!(date.getFullYear == 0 && (date.getMonth() + 1) == 0 && date.getDate() == 0)){
      setDay(date.getDate());
      setMonth(date.getMonth() + 1);
    }
    setFlag(true);
  }
  return (
    <div className='relative bg-gradient-to-r from-purple-500 to-pink-500
     w-full min-h-screen flex justify-center items-center'
     >
      <div className="absolute w-[20vw] h-[20vw]
      bg-gradient-to-r from-cyan-500 to-blue-500
       top-[15vh] left-[20vw] rounded-full z-1"></div>
      <div className="absolute w-[20vw] h-[20vw]
      bg-gradient-to-r from-lime to-green z-1
       right-[20vw] bottom-[15vh] rounded-full"></div>
      <div className="w-[50vh] h-[50vh] opacity-100 bg-black
       z-10 hover:shadow-xl flex justify-around items-center flex-col gap-[20px]">
          <input type="date" defaultValue={date} onChange={(d) =>setDate(new Date(d.target.value))} className="calendar" name="calendar"></input>
          <a onClick={d =>setLayout(d)} className="block px-[20px] bg-white rounded-[10px]
           py-[10px] hover:duration-300 hover:shadow-2xl"
           >
            Поднимите мне веки!
            </a>
       </div>
     </div>
  )
}