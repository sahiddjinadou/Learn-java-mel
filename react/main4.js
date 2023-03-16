
class TodoList extends React.Component {
    constructor(props) {
        super(props)
        this.state = {
            todosList: JSON.parse(localStorage.getItem("todos")),
            value: ''
        }
        const allLi = document.querySelectorAll('.forList>div>li');
        const alldeleteBtn = document.querySelectorAll('.forList>div>div>button');

        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
        // this.deleteClick = this.deleteClick.bind(this);
  
    }



    //Events
    handleChange(event) {
        this.setState({value: event.target.value});
        // this.setState({todosList: this.state.todosList.push(this.state.value)})
      }
    
    handleSubmit(event) {

        if(this.state.value == "") {
          
            document.querySelector(".alert").innerHTML = "Veuillez remplir le champ de saisie"
                // alert("Veuillez remplir le champ de saisie")
           
        }else{
            document.querySelector(".alert").innerHTML = "";
            this.state.todosList.unshift(this.state.value);
            //Add the input value to the localStorage
            localStorage.setItem("todos", JSON.stringify(this.state.todosList))
            this.setState({value: ""});
        }
       
        event.preventDefault();

        console.log(this.state.todosList);

      }

      deleteClick(event) {
        // event.preventDefault();
        const allLi = document.querySelectorAll('.forList>div>li');
        const alldeleteBtn = document.querySelectorAll('.forList>div>div>button');
        // allLi.forEach((btn) => {
        //     // btn.parentElement();
        //     // console.log(btn.parentElement.parentElement.firstChild.textContent);
        //     if(btn.textContent === "see") {
        //         console.log(btn);
        //     }
        //     // this.state.todosList.forEach((li) =>{
        //     //     console.log(li);
        //     //     if(btn.parentElement.parentElement.firstChild.textContent === li.textContent) {
        //     //         console.log(li);
        //     //     }
        //     // })
        // })
        console.log('click');
        console.log(i);
        
        
      }


  

    //Methods
    displayTodos() {
        // console.log(this.state.todosList);
        if(this.state.todosList !== null) {

            return(
    
            <ul className="forList">
                {
                    this.state.todosList.map((el, i) => {
                        // console.log(typeof(i))
                        return(
                            <div>
                                <li key={i}>{el}</li>
                                <div>
                                    <input type="checkbox"/>
                                    <button className="deletTodo" type="button" onClick={this.deleteClick.bind(this, i)}>❌</button>
                                </div>
                            </div>
                        )
                                
                    })
                }
            </ul>
            )
        }else{
            return(
                <p>Vous n'avez aucune tâche</p>

            )
        }

    }

    render() {
        

        return(
            <div>
                <h1>My todo-app</h1>
                <form className="" onSubmit = {this.handleSubmit}> 
                    <input type="text" className="todoText" value={this.state.value}  onChange = {this.handleChange}/>
                    <button type="submit">Ajouter ➕</button>
                </form>
                <p className="alert"></p>
                {this.displayTodos()}
            </div>
        )
    }
}

ReactDOM.render(
    <TodoList />,
    document.getElementById('root')
)