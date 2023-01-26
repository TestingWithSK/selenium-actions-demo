# Selenium – Actions Class
![Java](https://img.shields.io/badge/java-%23ED8B.svg?style=for-the-badge)
![Selenium](https://img.shields.io/badge/selenium-%797979.svg?style=for-the-badge)

Read the complete Blog - [How to use Actions Class in Selenium](https://testingwithsk.in/how-to-use-actions-class-in-selenium/)

In this article, you will learn about the Actions class and their example. Selenium provides different methods to perform click, input text, and select from dropdowns and tables. However, there are such complex actions that we need to perform like drag and drop, double click, right-click, and, many more. These actions can not be handled by simple web element commands. To handle those types of action, selenium provides Actions Class. Actions class is used to handle `Keyboard` and `Mouse` events.

## Actions Methods

|  Methods  | Description                                                                                   |
|:---------:|-----------------------------------------------------------------------------------------------|
|  clickAndHold()  | Clicks an element without releasing it.                                                       |
|  contextClick()  | Performs Mouse right-click on a given element                                                 |
|  doubleClick()  | Performs double click on a given element                                                      |
|  dragAndDrop(source, target)  | Click and hold the source element and move to the target location and then release            |
|  sendKeys()  | Sends a series of Keys to the given element.                                                  |
|  keyDown(KEY)  | Perform press the given KEY and do not release.KEY – Keys.ALT, Keys.SHIFT, Keys.CONTROL, etc. |
|  keyUp(KEY)  | Perform release of the given KEY.                                                             |
|  moveByOffset(X-offset, Y-offset)  | Moves the mouse to the given offset (X, Y)                                                    |
|  moveToElement(WebElement)  | Moves the mouse to the middle of the given element.                                           |

### Clone the repository using -

```shell
git clone https://github.com/TestingWithSK/selenium-actions-demo.git
```
### KeyBoard Actions
You can find the [KeyboardActions](https://github.com/TestingWithSK/selenium-actions-demo/blob/master/src/test/java/actionTests/KeyboardActions.java) class inside
`src/test/java/actionTests`. There you can see all the possible Actions methods are given.

### Mouse Actions
You can find the [MouseActions](https://github.com/TestingWithSK/selenium-actions-demo/blob/master/src/test/java/actionTests/MouseActions.java) class inside
`src/test/java/actionTests`. There you can see all the possible Actions methods are given.

### Run the Test Case -

- [x] Right click on any java file inside `src/test/java/actionTests` and select -  `Run '<FILE_NAME>'`

Read the complete Blog - [How to use Actions Class in Selenium](https://testingwithsk.in/how-to-use-actions-class-in-selenium/)

Happy Testing!!!

---

### Read More Articles
[![Testing Blog](https://img.shields.io/badge/-TestingWithSK-21759B?logo=wordpress&logoColor=white)](https://testingwithsk.in)

### Follow us on Social Media Accounts
[![LinkedIn](https://img.shields.io/badge/LinkedIn-%230077B5.svg?logo=linkedin&logoColor=white)](https://linkedin.com/in/shubhamkgupta14)
[![Instagram](https://img.shields.io/badge/Instagram-%23E4405F.svg?logo=Instagram&logoColor=white)](https://instagram.com/testingwithsk)
[![Facebook](https://img.shields.io/badge/Facebook-%231877F2.svg?logo=Facebook&logoColor=white)](https://facebook.com/testingwithsk)