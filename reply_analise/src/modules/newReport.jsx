
let NewReport = (props) =>{
   return(
      <div className="content-container">
         <div className="newReport-container">
            <div className="newReport">
               <h2>Отчет</h2>
               <h4>тип</h4>
               <div className="btn-container">
                  <a href="#">все</a>
                  <a href="#">положительные</a>
                  <a href="#">отрицательные</a>
               </div>
               <h4>статус</h4>
               <div className="btn-container">
                  <a href="#">все</a>
                  <a href="#">рассмотрено</a>
                  <a href="#">не рассмотрено</a>
               </div>
               <form>
                  <textarea name="" id="" cols="100" rows="15" placeholder="Текст отзыва"></textarea>
               </form>
               <a href="" className="btn-type-1">Сформировать</a>
               <div className="bg"><span></span></div>
            </div>
         </div>
      </div>
   )
}
export default NewReport;