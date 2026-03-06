// vars/sayHello.groovy
// A simple global function that prints a greeting message
def call(String name = 'Developer') {
    echo "Hello, ${name}! Welcome to the build." // 'echo' is a built-in Pipeline step
}
