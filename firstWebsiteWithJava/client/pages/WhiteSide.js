export default function WhiteSide({sign}){
    return(
        <a href={`http://localhost:3000/signs?name=${sign.rusName}`} className="block w-[49.9%] 
        min-h-[100vh] flex flex-col items-center justify-around 
        bg-gradient-to-r from-black3 to-blackSecond hover:shadow-4xl
        text-white
        ">
            <h2 className="text-[3em] italic">{sign.rusName}</h2>
            <h3 className="text-[1.5em]">{sign.date}</h3>
        </a>
    )
}