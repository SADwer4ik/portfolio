import { createStore, combineReducers } from "redux";
import { passwordReducer } from "./reducers/passwordReducer";
import { reportsReducer } from "./reducers/reportsReducers";
let reducers = combineReducers({
      passwordReducer,
      reportsReducer
   }); 
let store = createStore(reducers);

window.store = store;
export default store;