package auditloggrailsthree

import grails.plugins.orm.auditable.Auditable

class PartMaster implements Auditable {
    String partNumber;
}
