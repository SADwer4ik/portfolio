const addP = "addPost"

let initialState = {
   posts: [ 
   {id: "1", name: "Ivan", message: "Hey, brother"},
   {id: "2", name: "Ivan", message: "How are you"},
   {id: "3", name: "Ivan", message: "Hey, bro"},
   {id: "4", name: "Ivan", message: "Hey, bro"}
]
}

export const profileReducer = (state = initialState, action) =>{
   let copyState = {...state};
   copyState.posts = [...state.posts]
   if (action.type === addP){
      let newPost = {
         id:"5",
         name: "Vitaly",
         message: action.newMessage
      }
      copyState.posts.unshift(newPost);
   }
   return copyState; 
}


export const addPostActionCreator = (m) => {
   return {
      type: addP,
      newMessage: m
   } 
}