
const signInBtn = document.querySelector('#toggleSignIn');
const signUpBtn = document.querySelector('#toggleSignUp');

const signUpForm = document.querySelector('#sign-up-container');
const signInForm = document.querySelector('#sign-in-container');

// Change form when clicking on button
const changeForm = (form1, form2) => {
  form1.classList.toggle('hide');
  form2.classList.toggle('hide');
}

// Show the Sign In form
signInBtn.addEventListener('click', () => {
  changeForm(signUpForm, signInForm);
});

// Show the Sign Up form
signUpBtn.addEventListener('click', () => {
  changeForm(signUpForm, signInForm);
});