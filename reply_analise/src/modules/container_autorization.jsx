import { connect } from "react-redux"
import Autorization from "./autorization";
let mapStateToProps = (state) =>{
   return{
      password: state.passwordReducer.password
   }
}
let mapDispatchToProps = (dispatch) =>{
   return{
      passwordAction: () =>{
         dispatch();
      }
   }
}
const AutorizationContainer = connect(mapStateToProps, mapDispatchToProps) (Autorization);
export default AutorizationContainer;