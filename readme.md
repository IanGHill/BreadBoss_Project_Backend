### Bread Boss application (with Selenium Automation Test Framework)

Build a web application to allow bakeries to generate bread recipes & manage their portfolio of recipes. Recipe formulas will be based on ***"Baker's percentages"***.  

Bread recipes are designed using the concept of ***"Baker's percentages"***, whereby ingredient quantities are calculated *relative to the total flour weight*, rather than by "absolute percentages" of total recipe. 


#### MVP

- The user should be able to generate new sourdough bread recipes, choosing ingredients from a list of raw materials.
- The app should automatically calculate Baker's Percentages.
- It should be possible to be save, retrieve, update & delete recipes (full CRUD functionality).
- It should be possible to make changes to an existing recipe and save that as a new recipe (SAVE AS functionality).
- Provide base template for a recipe so that if a user is designing a recipe from scratch they have a basic starting point.
- It should be possible to display and update an image for each recipe.


#### Possible Extensions

- The application should work for different types of bread recipe:
	1. Sourdough
	2. Straight yeasted breads
	3. Breads made with a portion of pre-fermented flour (e.g. Ciabatta, Focaccia, Baguettes)
- Warnings should be issued if the recipe strays outside normal bread baking parameters (e.g. too much or too little salt).
- The application should have a suite of front-end automation tests built using Selenium Webdriver to test the functionality for recipe management. 
- It should be possible to scale recipes for different batch sizes (e.g. recipe designed for 1 x 800g loaf, but user wants to make 24  x 650g loaves).
- Should be possible to calculate total cost of raw materials (cost per batch and cost per loaf)
- The application should let the user maintain a list of raw materials (flours, nuts, seeds, oil, salt, yeast etc) (full CRUD functionality).
- When the application is fired up, the user should be presented with the last recipe that was created/amended.
- If there are no stored recipes the user should be presented with a basic template for a sourdough bread recipe.

####Technologies Used

*Back End*

- Java (Spring, Hibernate, Maven)
- PostgreSQL

*Front End*

- React.js
- HTML/CSS

*Testing Tools & Version Control*

- Selenium Webdriver & Chromedriver
- JUnit
- Insomnia
- Git/Github

*Project planning & design tools*

- Mockflow (wireframes)
- Trello (planning)
- Draw.io (UML diagrams)
- Google Slides (project presentation)