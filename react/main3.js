class App extends React.Component {
    constructor(props) {
        super(props)
        this.state = {
            count: 0,
        }
    }

    componentDidMount() {
        setInterval(
            () => {
            this.forCount()
        }, 200)
        console.log(window.screen.width);
    }
    
    forCount() {
        console.log(this.state.count);

        this.setState({
            count: this.state.count + 1,
        })

    }

    componentDidUpdate(prevProps, prevState) {
        if(prevProps !== prevState) {
            document.querySelector(".starContainer").innerHTML += '*';
        }
        this.goToLine(this.state.count);
    }

    goToLine(incr) {
        if(incr == 20) {
            document.querySelector(".starContainer").innerHTML += "<br/>";
            
            this.setState({
                count: 0,
            })
            // document.querySelector(".starContainer").innerHTML = "";
    
        }
    }


    render() {
        return(
            <div>
                <h1>Create star</h1>
                <p className="starContainer"> </p>
            </div>
        )
    }
}



// class CreateStars extends React.Component {

//     componentDidMount() {
//         console.log('cs');

//     }

//     render() {

//         return(
//             <div>
//                 <h1>Creat star</h1>
//                 <p className="starContainer"></p>
//             </div>
//         )
//     }
// }

ReactDOM.render(
    <App />,
    document.getElementById('root')
)