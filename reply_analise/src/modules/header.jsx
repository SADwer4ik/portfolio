import React from "react";
import { Link } from "react-router-dom";
let Header = (props) =>{
   return(
      <header className="header">
         <a href="/autorization" className="logo"></a>
         <h2 className="company_name">ООО МаркерСтрой</h2>
         <ul>
            <li><Link to="/subscribe">Подписка</Link></li>
            <li><Link to="/channels">Каналы</Link></li>
            <li><Link to="/notice">Уведомления</Link></li>
            <li><Link to="/stats">Статистика</Link></li>
         </ul>
         <div className="bg"><span></span></div>
      </header>
   );
};

export default Header;