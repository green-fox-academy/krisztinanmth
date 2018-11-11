/*
Error handling in Express

One of the most crucial things to get right when building web
applications are error handling. As the system will depend on other services,
databases, as well as consumers of those services, the unexpected becomes expected. Databases will fail,
services become unavailable and your consumers won’t be calling your endpoints with the parameters you expect.

To prepare your application for such circumstances,
you have to handle errors properly. Let’s take a look at the following endpoint:
*/

app.get('/users/:id', (req, res) => {
  const userId = req.params.id
  if (!userId) {
    return res.sendStatus(400).json({
      error: 'Missing id'
    })
  }

  Users.get(userId, (err, user) => {
    if (err) {
      return res.sendStatus(500).json(err)
    }

    res.send(users)
  })
})

/*
The endpoint above has some serious flaws:

it handles errors in different parts of the codebase,
it does not use Express’ error handler to have a unified error handling logic.
Let’s see how you can fix these issues! 👌
*/

/*
Adding the Express error handler
All Express route handlers come with a third function parameter, next,
which can be used to call the next middleware, or to signal Express that an error happened:
*/
app.get('/users/:id', (req, res, next) => {
  const userId = req.params.id
  if (!userId) {
    const error = new Error('missing id')
    error.httpStatusCode = 400
    return next(error)
  }

  Users.get(userId, (err, user) => {
    if (err) {
      err.httpStatusCode = 500
      return next(err)
    }

    res.send(users)
  })
})
/*
This way you’ve already let Express know that an error arose, and
the error handler will get called. To add an error handler to your application,
you have to add a middleware with four parameters - that’s how Express will know it is an error handler.
*/
app.use((err, req, res, next) => {
  // log the error...
  res.sendStatus(err.httpStatusCode).json(err)
})

/*
Even if this solution works, it adds a lot of boilerplate code - let’s get rid of that!

Meet boom
*/
