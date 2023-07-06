import { connect } from "react-redux";
import Subscribe from "./subscribe";
let mapStateToProps = (state) =>{
   return{
      lastReports: state.reportsReducer.reports
   }
}
let mapDispatchToProps = (dispatch) =>{
   return{
      passwordAction: () =>{
         dispatch();
      }
   }
}
const SubscribeContainer = connect(mapStateToProps, mapDispatchToProps) (Subscribe);
export default SubscribeContainer;