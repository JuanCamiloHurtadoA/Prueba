Feature: Add a new category on the phptravels blog

  Scenario: Add a new category on the blog
    Given Open chrome browser
      | email            | password    |
      | admin@phptravels.com  | demoadmin |
    When a new category is added to the blog
      | name  | vietnamese | russian  | arabic | farsi  | turkish  | french | spanish | german  |
      | color | Màu sắc     | Цвет    |اللون    |رنگ     |  Renk    |Couleur | Color   |  Farbe  |
    Then a post is created and it is validated that it is created correctly
     | name | keywords |  description |
     | color | colores | descubre los colores mas especiales|