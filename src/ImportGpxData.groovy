
def file = new File('../data/barrett_spur.gpx')

def slurper = new XmlSlurper()
def data = slurper.parse(file)

// access any element inside the xml directly by using dot operator
println data.name
println data.description

// accessing attributes in an xml file use @
println data.@version
println data.@creator

// accessing collection of child elements
/*for (point in data.wpt) {
    println point.@lat
    println point.@lon
}*/

data.wpt.each {
    println it.@lat
    println it.@lon
}
