package auditloggrailsthree

import grails.plugins.orm.auditable.Auditable

class Aircraft implements Auditable {
    String ac;

    transient Collection<PartMaster> partMasterCollection;

    public Aircraft() {
        super();
        log.info("con, this.ac: " + this.ac);
    }

    def get(Long id) {
        super.get(id);
        log.info("get, this.ac: " + this.ac);
    }
}
