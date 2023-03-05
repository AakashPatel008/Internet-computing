var x = document.getElementById("form_sample");
var createform = document.createElement('form'); 
createform.setAttribute("action", ""); 
createform.setAttribute("method", "post");
x.appendChild(createform);

var heading = document.createElement('h2'); 
heading.innerHTML = "Contact Me ";
createform.appendChild(heading);

var line = document.createElement('hr');
createform.appendChild(line);

var linebreak = document.createElement('br');
createform.appendChild(linebreak);

var namelabel = document.createElement('label');
namelabel.innerHTML = "Your Name : "; 
createform.appendChild(namelabel);

var inputelement = document.createElement('input'); 
inputelement.setAttribute("type", "text");
inputelement.setAttribute("name", "dname");
createform.appendChild(inputelement);

var linebreak = document.createElement('br');
createform.appendChild(linebreak);

var subjectlabel = document.createElement('label'); 
subjectlabel.innerHTML = "Your Subject : ";
createform.appendChild(subjectlabel);

var subjectelement = document.createElement('input'); 
subjectelement.setAttribute("type", "text");
subjectelement.setAttribute("name", "demail");
createform.appendChild(subjectelement);

var subjectbreak = document.createElement('br');
createform.appendChild(subjectbreak);

var messagelabel = document.createElement('label'); // Append Textarea
messagelabel.innerHTML = "Your Message : ";
createform.appendChild(messagelabel);

var texareaelement = document.createElement('textarea');
texareaelement.setAttribute("name", "dmessage");
createform.appendChild(texareaelement);

var messagebreak = document.createElement('br');
createform.appendChild(messagebreak);

var submitelement = document.createElement('input'); // Append Submit Button
submitelement.setAttribute("type", "submit");
submitelement.setAttribute("name", "dsubmit");
submitelement.setAttribute("value", "Submit");
createform.appendChild(submitelement);

