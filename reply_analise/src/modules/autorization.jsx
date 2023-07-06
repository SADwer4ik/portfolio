import React from "react";
let Autorization = (props) =>{
   let btnShowPassword = React.createRef();
   let btnChangeType = React.createRef();
   return(
      <div className="autorization">
         <input type="text" className = "name" placeholder="Имя пользователя"></input>
         <div className="passwordBox">
            <input ref = {btnChangeType} type="password" className ="name" placeholder="Пароль"></input>
            <svg  ref={btnShowPassword} onClick={() =>{
               btnShowPassword.current.classList.toggle("active");
               if(btnChangeType.current.type === "text"){
                  btnChangeType.current.type = "password";
               }
               else{
                  btnChangeType.current.type = "text";
               }
         }}></svg>
         </div>
         <a href="#" className="btn-type-1">Войти</a>
      </div>
   );
}
export default Autorization;