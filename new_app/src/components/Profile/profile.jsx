import image from "../../images/fron_profile_picture.jpg";
import Post from "./post.jsx";
import React from "react";
import { addPostActionCreator } from "../../redux/profile-reducer.js";
function Profile(props) {
   let postElements = props.userMessages.posts
   .map(mess => <Post name = {mess.name} message = {mess.message}/>)
   let addPosts = React.createRef();
   let newPost = () =>{
      let m = addPosts.current.value;
      props.dispatch(addPostActionCreator(m));
      addPosts.current.value = '';
   }
   return (
      <div className="wrap_profile">
         <img src={image} alt="" />
         <div className="addPost_box">
            <input id="inputBlock" ref = {addPosts} type="text" placeholder="New Post" />
            <button onClick = {newPost}>Add Post</button>
         </div>
         <div className="posts">
            {postElements}
         </div>
      </div>
   );
}
export default Profile;
