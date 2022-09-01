### Hi there, I'm Jimboy- aka [agentOrange002][website] 👋

[![Website](https://img.shields.io/website?label=agentOrange002.com&style=for-the-badge&url=https%3A%2F%2Fdistracted-einstein-e83f94.netlify.app)](https://distracted-einstein-e83f94.netlify.app/)


<img src="readme.png" align="right" />

# CSC - REST API [![Awesome](https://cdn.rawgit.com/sindresorhus/awesome/d7305f38d29fed78fa85652e3a63e154dd8e8829/media/badge.svg)](https://github.com/agentOrange002/its-gradle#readme)
> Calendar Schedule Calculator - Details

1. We need to calculate calendar schedules for project plans
2. Each project plan consists of tasks. Every task has a certain duration.
3. A task can depend on zero or more other tasks. If a task depends on some other tasks, it can only be started after these tasks are completed
4. So, for a set of tasks (with durations and dependencies), the solution for the challenge should generate a schedule, i.e. assign Start and End Dates for every task

<br />

### Languages and Tools:

[<img align="left" alt="Java" width="26px" src="https://cdn.jsdelivr.net/npm/simple-icons@v3/icons/java.svg"/>][website]

[<img align="left" alt="Spring" width="26px" src="https://cdn.jsdelivr.net/npm/simple-icons@v3/icons/spring.svg"/>][website]

[<img align="left" alt="MySQL" width="26px" src="https://cdn.jsdelivr.net/npm/simple-icons@v3/icons/mysql.svg"/>][website]

[<img align="left" alt="Maven" width="26px" src="https://cdn.jsdelivr.net/npm/simple-icons@v3/icons/apachemaven.svg"/>][website]


<br />
<br />

## Available Maven Command

In the project directory, you can run:

### `mvn spring-boot:run`

Runs the restfull app.
Open [http://localhost:8080](http://localhost:8080) to view it in the browser.

### `mvn clean install package`

Builds the jar file for production.
Make sure that build jar first before run this command.


<br />
<br />

## Testing 

### `First we need create a project plan`

POST Save Project Plan: `http://localhost:8080/plan`

Request Body JSON
```
{
	"plan_name":"First Plan",
	"plan_description":"First Plan Description"
	
}
```

### `Second we need create a task`

POST Save Task: `http://localhost:8080/task`

Request Body JSON
```
{
	"task_name":"First Task",
	"task_description":"First Task Description",
	"task_duration":4, //provide duration - I use hour as duration
	"task_order": 1, //provide order number tasks on the project plan - the best and simple setup for dependecies to some others tasks by organizing it by order
	"plan_id":1 //the id plan project - the task will tagged under the plan
}
```


### `Generation of start and date on tasks under certain project plan `

POST Generate: `http://localhost:8080/plan/generate/{planid}`

### `View project plan and its task in detailed`

GET View Project Plan By ID: `http://localhost:8080/plan/{planid}`


## SpringDocs OpenAPI

Check it: `http://localhost:8080/swagger-ui.html`


<br/>

➡️ [more projects...](https://github.com/agentOrange002?tab=repositories)

---

[website]: https://distracted-einstein-e83f94.netlify.app/
