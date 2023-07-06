import { connect } from "react-redux";
import Stats from "./stats";
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
const StatsContainer = connect(mapStateToProps, mapDispatchToProps) (Stats);
export default StatsContainer;