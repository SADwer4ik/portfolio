import {connect} from "react-redux";
import Users from "./users";
import { follow, setUsers, unfollow, setCurrentPage } from "../redux/users-reducer";
let mapStateToProps = (state) =>{
   return {
      users: state.usersPage.users,
      pageSize: state.usersPage.pageSize,
      totalUsersCount:state.usersPage.totalUsersCount,
      currentPage: state.usersPage.currentPage
   }
}
/*let mapDispatchToProps = (dispatch) =>{
   return{
      follow:(userID) =>{
         dispatch(followAC(userID));
      },
      unfollow:(userID)=>{
         dispatch(unfollowAC(userID));
      },
      setUsers:(users) =>{
         dispatch(setUsersAC(users));
      },
      currentPage:(page) =>{
         dispatch(setCurrentPageAC(page))
      }
   }
}*/
export let UsersContainer = connect(mapStateToProps, {follow, unfollow, setUsers, setCurrentPage})(Users);