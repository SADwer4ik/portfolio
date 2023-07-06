let Review = (props) =>{
   debugger;
   return(
      <div className="review">
         <div className="top-element">
            <h4>{props.report.name}</h4>
            <div className="roles">
               <a href="#">Ярославль</a>
               <a href="#">Ярославль</a>
               <a href="#">Ярославль</a>
               <div href="#" className="eth-btn"><span></span> <span></span> <span></span></div>
            </div>
         </div>
         <div className="review-text">
         <p>{props.report.message}</p>
         </div>
         <a className="see-more">Посмотреть полностью</a>
         <input type="text" placeholder="Отзыв Поставщику"/>
      </div>
   );
}
export default Review;