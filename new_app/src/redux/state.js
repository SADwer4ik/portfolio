import { profileReducer } from "./profile-reducer";

let store = {
   _state: {
      posts: [ 
         {id: "1", name: "Ivan", message: "Hey, brother"},
         {id: "2", name: "Ivan", message: "How are you"},
         {id: "3", name: "Ivan", message: "Hey, bro"},
         {id: "4", name: "Ivan", message: "Hey, bro"}
      ]
   },
   getState(){
      return this._state;
   },
   _callSubscriber(){
      console.log("Hello");
   },
   subscribe(observer){
      this._callSubscriber = observer;
   },
   /*addPost(newMessage){
      let newPost = {
         id:"5",
         name: "Vitaly",
         message: newMessage
      }
      this._state.posts.unshift(newPost);
      this._callSubscriber(this._state);
      }*/
   dispatch(action){
      this._state.posts = profileReducer(this._state.posts, action);
         this._callSubscriber(this._state);
   }
}
export default store;