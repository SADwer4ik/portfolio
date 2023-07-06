import { Link } from "react-router-dom";
let Subscribe = (props) =>{
   let lastReports = props.lastReports.map(m => <a href={m.id}>{m.name}</a>)
   return(
      <div className="content-container subscribe">
         <div className="top-blocks">
            <div className="my-subscribe block-standart-design">
               <h2>Моя подписка</h2>
               <ul>
                  <li><h3>Активна</h3></li>
                  <li><h3>Действует до</h3></li>
               </ul>
               <Link to="#" className="btn-type-1 btn-extend">Продлить</Link>
            </div>
            <div className="my-subscribe block-standart-design">
               <h2>Мои каналы</h2>
               <ul>
                  <li><h3>Vk</h3></li>
                  <li><h3>Яндекс.Карты</h3></li>
                  <li><h3>2ГИС</h3></li>
                  <li><h3>Google Карты</h3></li>
               </ul>
               <Link to="#"></Link>
            </div>
            <div className="my-subscribe block-standart-design">
               <h2>Мои уведомления</h2>
               <ul>
                  <li><h3>1111111</h3></li>
                  <li><h3>11111111</h3></li>
                  <li><h3>1111111111111</h3></li>
               </ul>
               <Link to="#"></Link>
            </div>
         </div>
         <div className="sub-stats block-standart-design">
            <h2>Моя статистика</h2>
            <div className="my-stats-content">
               <div className="chart"><img src="" alt="" /></div>
               <div className="latest-reports">
                  <h3>Последние отчеты</h3>
                  {lastReports}
                  <a href="newreport" className="btn-type-2">Сформировать новый отчет</a>
               </div>
            </div>
         </div>
      </div>
   )
};
export default Subscribe;