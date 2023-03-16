
        class Clock extends React.Component {
            constructor(props) {
                super(props)
                this.state = {
                    time: 0,
                    toMount: true
                }

            }

            componentDidMount() {
                this.timeId = setInterval(
                    () =>{
                    this.toTime();
                    // console.log("this.toTime()");

                }, 1000)

                // this.changeDisplay();
            }

            // componentDidUpdate(prevProps, prevState) {
            //     console.log("prevProps" + this.state.time, "prevState" + prevState.time);
            // }

            changeDisplay() {
                setTimeout(() =>{
                    this.setState ({toMount: !this.state.toMount})
                }, 2000)
            }


            horloge(time) {
                return {
                    hour: `${Math.floor(time / 3600)}`,
                    min: `${(Math.floor(time / 60) % 60)}`,
                    second: `${time % 60}`
                }
            }

            toTime() {
                this.setState({
                    time: this.state.time +1
                });
            
            }


            render() { 
                /**
                 * Destructuring
                 * 
                 *the method horloge return an objet and with destructuring we retrieve each property
                 */            
                const {hour, min, second} = this.horloge(this.state.time)
                let theComponent;
                
                if(this.state.toMount) {
                    theComponent = <Display h={hour} m={min} s={second} disp={this.state.toMount}/>                  
                }

                return (
                    <div>
                        {theComponent}
                    </div>

                )

            }
        }


        class Display extends React.Component {

            constructor(props) {
                super(props)
                this.state = {
                    forDisp: this.props.disp
                }
                // this.handleClick = this.handleClick.bind(this)
            }

            componentDidMount() {
                if(!this.state.forDisp) {
                    console.log('if');

                    document.querySelector('.greenting').innerHTML = "Hello ici";
                }
                console.log('mounted');

            }

            // componentDidUpdate(prevProps, prevState) {
            //     if(this.state.forDisp !== prevState) {
            //         document.querySelector('.greenting').innerHTML = "Hello ici";
            //     }else {
            //         document.querySelector('.greenting').innerHTML = "coucou chez vous";
            //     }
            //     // console.log("update" + prevState.forDisp);

            // }

            componentWillUnmount() {
                console.log("unmounted");

                clearInterval(this.timeId)
            }

            handleClick = () => {
                this.setState({
                    forDisp: !this.state.forDisp
                })

                console.log("click");
                console.log(this.state.forDisp);
            }


            render() {
  
                return (
                    
                    <div className="forClock">
                    <h1>Display clock</h1>
                        <p>{this.props.h}h {this.props.m}m {this.props.s}s</p>                        
                        <button onClick={this.handleClick}>on</button>
                        <p className="greenting">coucou chez vous</p>
                    </div>  

                )
            }
        }

        ReactDOM.render(<Clock />, document.getElementById('root'));
