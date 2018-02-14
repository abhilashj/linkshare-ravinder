databaseChangeLog = {

    changeSet(author: "ravinder (generated)", id: "1518587185469-1") {
        createTable(tableName: "reading_item") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "reading_itemPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "is_read", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "resource_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "user_id", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-2") {
        createTable(tableName: "resource") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "resourcePK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "description", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "class", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "file_path", type: "VARCHAR(255)")

            column(name: "url", type: "VARCHAR(255)")
        }
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-3") {
        createTable(tableName: "resource_rating") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "resource_ratingPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "resource_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "score", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "user_id", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-4") {
        createTable(tableName: "role") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "rolePK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "authority", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-5") {
        createTable(tableName: "subscription") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "subscriptionPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "seriousness", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "topic_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "user_id", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-6") {
        createTable(tableName: "topic") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "topicPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "user_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "visibility", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-7") {
        createTable(tableName: "topic_resources") {
            column(name: "topic_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "resource_id", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-8") {
        createTable(tableName: "user") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "userPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "account_expired", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "account_locked", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "active", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "admin", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "email", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "enabled", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "first_name", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "last_name", type: "VARCHAR(255)")

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "password", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "password_expired", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "photo", type: "BLOB")

            column(name: "username", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-9") {
        createTable(tableName: "user_resources") {
            column(name: "resource_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "user_id", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-10") {
        createTable(tableName: "user_role") {
            column(name: "user_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "role_id", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-11") {
        addPrimaryKey(columnNames: "topic_id, resource_id", tableName: "topic_resources")
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-12") {
        addPrimaryKey(columnNames: "user_id, resource_id", tableName: "user_resources")
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-13") {
        addPrimaryKey(columnNames: "user_id, role_id", constraintName: "user_rolePK", tableName: "user_role")
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-14") {
        addUniqueConstraint(columnNames: "authority", constraintName: "UC_ROLEAUTHORITY_COL", tableName: "role")
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-15") {
        addUniqueConstraint(columnNames: "name", constraintName: "UC_TOPICNAME_COL", tableName: "topic")
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-16") {
        addUniqueConstraint(columnNames: "email", constraintName: "UC_USEREMAIL_COL", tableName: "user")
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-17") {
        addUniqueConstraint(columnNames: "username", constraintName: "UC_USERUSERNAME_COL", tableName: "user")
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-18") {
        addForeignKeyConstraint(baseColumnNames: "topic_id", baseTableName: "topic_resources", constraintName: "FK_37y0q498x6na980eu1jbjx7cf", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "topic")
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-19") {
        addForeignKeyConstraint(baseColumnNames: "resource_id", baseTableName: "reading_item", constraintName: "FK_93xit1asu8caf665svq0vqmeq", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "resource")
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-20") {
        addForeignKeyConstraint(baseColumnNames: "topic_id", baseTableName: "subscription", constraintName: "FK_aojatoh2ykivd0ukh09f4mn11", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "topic")
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-21") {
        addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "user_role", constraintName: "FK_apcc8lxk2xnug8377fatvbn04", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user")
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-22") {
        addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "topic", constraintName: "FK_c975xs66f0v6extdjdl0csctr", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user")
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-23") {
        addForeignKeyConstraint(baseColumnNames: "resource_id", baseTableName: "topic_resources", constraintName: "FK_eae251lga1qm0xhhqw2dqiatg", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "resource")
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-24") {
        addForeignKeyConstraint(baseColumnNames: "resource_id", baseTableName: "resource_rating", constraintName: "FK_hmnf6fb69j5w3nttui4g372w9", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "resource")
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-25") {
        addForeignKeyConstraint(baseColumnNames: "role_id", baseTableName: "user_role", constraintName: "FK_it77eq964jhfqtu54081ebtio", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "role")
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-26") {
        addForeignKeyConstraint(baseColumnNames: "resource_id", baseTableName: "user_resources", constraintName: "FK_iygtbioemc8ucik4wou4n0ho2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "resource")
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-27") {
        addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "user_resources", constraintName: "FK_n0jajce4ofrmt665xmyhvf5lp", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user")
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-28") {
        addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "resource_rating", constraintName: "FK_qae5oa07q1791tfyocrc7w995", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user")
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-29") {
        addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "reading_item", constraintName: "FK_rmxs9jrphvwn7tyg2n82p8wq0", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user")
    }

    changeSet(author: "ravinder (generated)", id: "1518587185469-30") {
        addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "subscription", constraintName: "FK_tq3cq3gmsss8jjyb2l5sb1o6k", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user")
    }
}
