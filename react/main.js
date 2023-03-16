
        class Clock extends React.Component {
            constructor(props) {
                super(props)
                this.state = {
                    date: new Date(),
                    display: true
                }
            }

            componentDidMount() {
                // console.log("mounted");
                this.timeId = setInterval(() =>{
                    this.toTime()
                }, 1000)
            }

            componentWillUnmount() {
                // console.log("unmounted");

                clearInterval(this.timeId)
            }

            toTime() {
                this.setState({
                    date: new Date()
                })
            }

            render() {

                // console.log(this.state.date);
                return (
                    <Display  clock={this.state.date}/>
                )
            }
        }


        class Display extends React.Component {

            render() {
  
                return (
                    
                        <div className="forClock">
                        <h1>Display clock</h1>
                            <p>{this.props.clock.toDateString()}</p>
                            <p>{this.props.clock.getHours()}h : {this.props.clock.getMinutes()}min : {this.props.clock.getSeconds()}</p>
                            
                        </div>  

                )
            }
        }

        ReactDOM.render(<Clock />, document.getElementById('root'));
