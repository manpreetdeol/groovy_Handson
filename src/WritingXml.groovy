import groovy.xml.XmlSlurper

def file = new File('../data/barrett_spur.gpx')
def slurper = new XmlSlurper()
def gpx = slurper.parse(file)

// we use StreaminMarkupBuilder due to its added value
def markupBuilder = new groovy.xml.StreamingMarkupBuilder()
// bind closure will contain the xml that we want to write
def xml = markupBuilder.bind {
    // For creating a parent element
    route {
        mkp.comment(gpx.description)
        gpx.wpt.each { point ->
            // the argument passed here is the attribute of the 'routepoint' child element
            routepoint(timestamp: point.time.toString()) {
                // 'latitude' and 'longitude' means that we are creating new elements of lon & lat instead of attributes
                latitude(point.@lat)
                longitude(point.@lon)
            }
        }
    }
}

// write xml to output file
def outFile = new File('../data/outputFile.xml')
outFile.write(xml.toString())
