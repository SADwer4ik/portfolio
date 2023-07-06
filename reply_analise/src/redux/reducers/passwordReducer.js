const passActive = "passActive";
let initialState = {
   password:{
      type:"text",
      classN:"none"
   }
}
export const passwordReducer = (state = initialState, action) =>{
   let stateCopy = {...state};
   stateCopy.password = {...state.password}
   if(action.type === passActive){
      if(stateCopy.password.type === "password"){
         stateCopy.password.type = "text";
         stateCopy.password.classN = "active";
      }
      if(stateCopy.password.type === "text"){
         stateCopy.password.type = "password";
         stateCopy.password.classN = "none";
      }
   }
   console.log(state);
   return stateCopy;
}