
const FOLLOW = "follow"
const UNFOLLOW = "unfollow"
const SET_USERS = "set-users"
const SET_CURRENT_PAGE = "SET_CP"
const URLPIC = "data:image/jpeg;base64,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"
let initialState = {
   users: [ 
],
   pageSize: 5,
   totalUsersCount: 19,
   currentPage: 2
}
export const usersReducer = (state = initialState, action) =>{
   switch(action.type){
      /*case FOLLOW:
      return {
         ...state,
          users: state.users.map(u => {
            if (u.id === action.userID){
               return {...u, followed: true}
            }
            return u;
         })
         }
      case UNFOLLOW:
         return {
            ...state,
            users: state.users.map(u =>{
               if (u.id === action.userID){
                  return {...u, followed:false}
               }
               return u;
            })
         }*/
      case SET_USERS:
         return {...state, users: [...state.users, ...action.users]}
      case SET_CURRENT_PAGE:
         return state;
   }
   return state;
}

export const follow = (userID) => {return {type:FOLLOW, userID: userID}}
export const unfollow = (userID) => {return{type: UNFOLLOW, userID: userID}}
export const setUsers = (users) => ({type:SET_USERS, users})
export const setCurrentPage = (page) =>({type:SET_CURRENT_PAGE, page});