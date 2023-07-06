import Review from "./review";
let Stats = (props) =>{
   let reviews = props.lastReports.map(m => <Review report = {m}/>)
   return(
      <div className="content-container">
         <div className="top-btn">
            <div className="top-blocks">
               <div className="block-standart-design schedule"></div>
               <div className="reply block-standart-design ">
                  <h3>Отчет</h3>
                  <p>Всего отзывов: 30</p>
               </div>
            </div>
            <div className="btn-type-1">Новый отчет</div>
         </div>
         <div className="reviews">
            {reviews}
         </div>
      </div>
   )
}
export default Stats;