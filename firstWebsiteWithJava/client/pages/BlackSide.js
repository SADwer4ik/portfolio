export default function BlackSide({sign}){
    return(
        <a href={`http://localhost:3000/signs?name=${sign.rusName}`} className="w-[49.9%] min-h-[100vh] flex flex-col items-center justify-around 
        bg-gradient-to-r from-whiteSide to-black hover:shadow-3xl
        ">
            <h2 className="text-[3em] italic">{sign.rusName}</h2>
            <h3 className="text-[1.5em]">{sign.date}</h3>
        </a>
    )
}