React:

    import axios from 'axios'

    [...]

    const testHttpErrors = () => {
        axios.get("http://127.0.0.1:8080/exception/{error_type}").catch(e => {
            console.log('Error: ' + e)
        })
    }
    
    useEffect(() => {
        testHttpErrors()
    }, [])