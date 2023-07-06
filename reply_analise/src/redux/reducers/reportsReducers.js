let initialState = {
   reports:[
      {
      id: "1",
      name: "Andrey",
      message:"lorem ipsu"
   },
   {
      id: "1",
      name: "Andrey",
      message:"lorem ipsu",
      /*city:"Yaroslavl",
      profession: "engeener",
      company:"OOO Marker Stroy",
      adressC: "..."
      */
   }
]
}
export const reportsReducer = (state = initialState, action) =>{
   let stateCopy = {...state};
   return stateCopy;
}