package auditloggrailsthree

import grails.plugins.orm.auditable.Auditable

class AircraftsParts implements Auditable {
    Aircraft aircraft;
    PartMaster partMaster;
}
