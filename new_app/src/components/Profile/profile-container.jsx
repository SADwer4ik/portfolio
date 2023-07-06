import React from "react";
import Profile from "./profile.jsx";
import {connect} from "react-redux"
let mapStateToProps = (state) =>{
   return{
      userMessages: state.posts
   }
}
let mapDispatchToProps = (dispatch) => {
   return{
      dispatch: dispatch
   }
}

const ProfileContainer = connect(mapStateToProps, mapDispatchToProps)(Profile);
export default ProfileContainer;
