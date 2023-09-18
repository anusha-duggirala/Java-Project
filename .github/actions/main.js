const core = require('@actions/core');

function run() {
  // 1) Get some input values
  const num1 = core.getInput('input1', { required: true });
  const num2 = core.getInput('input2', { required: true });
  
  const sum=parseInt(num1) + parseInt(num2) ;
  
  core.setOutput('output', sum); 
}

run();