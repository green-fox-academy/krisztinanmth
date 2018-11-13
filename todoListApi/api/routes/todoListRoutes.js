/*
routing refers to determining how an application responds to a client request for a specific endpoint,
which is a URI (or path) and a specific HTTP request method (GET, POST, and so on)...
each of these routes has different route handler functions, which are executed when the route is matched.
*/
'use strict';
module.exports = function(app) {
  const todoList = this.require('../controllers/todoListController');

  // todoList Routes
  app.route('/tasks')
    .get(todoList.list_all_tasks)
    .post(todoList.create_a_task);

  app.route('/tasks/:taskId')
    .get(todoList.read_a_task)
    .put(todoList.update_a_task)
    .delete(todoList.delete_a_task);
};
