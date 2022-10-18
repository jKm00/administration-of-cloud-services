<script lang="ts">
  interface Todo {
    id: number;
    title: string;
    completed: boolean;
  }

  let id = 0;
  let input = '';
  let todos = [
    {
      id: id++,
      title: 'My first todo',
      completed: false,
    },
  ] as Todo[];

  const addTodo = () => {
    if (input.length === 0) return;
    todos = [...todos, { id: id++, title: input, completed: false }];
    input = '';
  };

  const removeCompleted = () => {
    todos = todos.filter(todo => !todo.completed);
  };

  const removeAll = () => {
    todos = [];
  };
</script>

<main>
  <h1>Your todos</h1>
  <section class="todo">
    <form class="todo-form" on:submit|preventDefault={addTodo}>
      <input
        class="todo-input"
        bind:value={input}
        type="text"
        placeholder="Add todo..."
      />
      <button class="todo-submit" type="submit">Add</button>
    </form>
    <ul class="todo-list">
      {#each todos as item}
        <label>
          <li class="todo-item" class:completed={item.completed}>
            {item.title} <input bind:checked={item.completed} type="checkbox" />
          </li>
        </label>
      {/each}
    </ul>
    <div class="toolbar">
      <button on:click={removeCompleted}>Remove completed</button>
      <button on:click={removeAll}>Remove all</button>
    </div>
  </section>
</main>

<style>
  .todo {
    display: flex;
    flex-direction: column;
    gap: 1em;
    background-color: #1a1a1a;
    padding: 2em;
    box-shadow: 0px 5px 10px rgb(0 0 0 / 0.5);
  }

  .todo-form {
    display: flex;
    justify-content: space-between;
    align-items: stretch;
    gap: 0.5rem;
  }

  .todo-input {
    padding: 0.5em 1em;
    background-color: lightgray;
    min-width: 20rem;
    color: black;
  }

  .todo-submit {
    padding: 0 1em;
    background-color: lightcoral;
  }

  .todo-list {
    display: flex;
    flex-direction: column;
    list-style: none;
    height: 25rem;
    overflow-y: auto;
  }

  .todo-item {
    display: flex;
    justify-content: space-between;
  }

  .todo-item.completed {
    text-decoration: line-through;
    opacity: 0.7;
  }
</style>
