import axios from "axios"
import userPhoto from "../images/person-outline.svg"
import React from "react"
class Users extends React.Component {
   getUsers(){
      axios.get(`https://social-network.samuraijs.com/api/1.0/users`).then(response =>{
         this.props.setUsers(response.data.items);
      })
   }
   render() {
      return(
      <div className="wrap_users">
         {
            this.props.users.map(u =>{
               return(
               <div key={u.id} className="user">
                  <img src={u.photos.small != null ? u.photos.small : userPhoto} alt="" />
                  <div className="user-name">{u.name}</div>
                  <div className="user-status">{u.status}</div>
                  <div className="location">
                     <div>country</div>
                     <div>city</div>
                     </div>
                     {u.followed ?
                     <div onClick={() => {this.props.unfollow(u.id)}} className="follow-btn">Unfollow</div>
                     : <div onClick={() => {this.props.follow(u.id)}} className="follow-btn">Follow</div>}
               </div>
               )
            })
         }
         <div onClick={this.getUsers} className="getUsers-btn">Добавить пользователей</div>
      </div>
      )
   }
}
export default Users;