package decorator

class Garland(tree: ChristmasTree) : TreeDecorator(tree) {
    override fun decorate(): String {
        return super.decorate() + decoratedWithGarland()
    }

    private fun decoratedWithGarland(): String = " with garland"
}