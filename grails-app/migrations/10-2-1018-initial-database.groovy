databaseChangeLog = {

    changeSet(author: "ravinder (generated)", id: "1518283014081-1") {
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

    changeSet(author: "ravinder (generated)", id: "1518283014081-2") {
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

            column(name: "url", type: "VARCHAR(255)")

            column(name: "file_path", type: "VARCHAR(255)")
        }
    }

    changeSet(author: "ravinder (generated)", id: "1518283014081-3") {
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

    changeSet(author: "ravinder (generated)", id: "1518283014081-4") {
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

    changeSet(author: "ravinder (generated)", id: "1518283014081-5") {
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

    changeSet(author: "ravinder (generated)", id: "1518283014081-6") {
        createTable(tableName: "topic_resources") {
            column(name: "topic_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "resource_id", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "ravinder (generated)", id: "1518283014081-7") {
        createTable(tableName: "user_resources") {
            column(name: "user_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "resource_id", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "ravinder (generated)", id: "1518283014081-8") {
        addColumn(tableName: "user") {
            column(name: "active", type: "bit") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "ravinder (generated)", id: "1518283014081-9") {
        addColumn(tableName: "user") {
            column(name: "admin", type: "bit") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "ravinder (generated)", id: "1518283014081-10") {
        addColumn(tableName: "user") {
            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "ravinder (generated)", id: "1518283014081-11") {
        addColumn(tableName: "user") {
            column(name: "email", type: "varchar(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "ravinder (generated)", id: "1518283014081-12") {
        addColumn(tableName: "user") {
            column(name: "first_name", type: "varchar(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "ravinder (generated)", id: "1518283014081-13") {
        addColumn(tableName: "user") {
            column(name: "last_name", type: "varchar(255)")
        }
    }

    changeSet(author: "ravinder (generated)", id: "1518283014081-14") {
        addColumn(tableName: "user") {
            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "ravinder (generated)", id: "1518283014081-15") {
        addColumn(tableName: "user") {
            column(name: "photo", type: "tinyint")
        }
    }

    changeSet(author: "ravinder (generated)", id: "1518283014081-16") {
        addPrimaryKey(columnNames: "topic_id, resource_id", tableName: "topic_resources")
    }

    changeSet(author: "ravinder (generated)", id: "1518283014081-17") {
        addPrimaryKey(columnNames: "user_id, resource_id", tableName: "user_resources")
    }

    changeSet(author: "ravinder (generated)", id: "1518283014081-18") {
        addUniqueConstraint(columnNames: "name", constraintName: "UC_TOPICNAME_COL", tableName: "topic")
    }

    changeSet(author: "ravinder (generated)", id: "1518283014081-19") {
        addUniqueConstraint(columnNames: "email", constraintName: "UC_USEREMAIL_COL", tableName: "user")
    }

    changeSet(author: "ravinder (generated)", id: "1518283014081-20") {
        addForeignKeyConstraint(baseColumnNames: "topic_id", baseTableName: "topic_resources", constraintName: "FK_37y0q498x6na980eu1jbjx7cf", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "topic")
    }

    changeSet(author: "ravinder (generated)", id: "1518283014081-21") {
        addForeignKeyConstraint(baseColumnNames: "resource_id", baseTableName: "reading_item", constraintName: "FK_93xit1asu8caf665svq0vqmeq", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "resource")
    }

    changeSet(author: "ravinder (generated)", id: "1518283014081-22") {
        addForeignKeyConstraint(baseColumnNames: "topic_id", baseTableName: "subscription", constraintName: "FK_aojatoh2ykivd0ukh09f4mn11", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "topic")
    }

    changeSet(author: "ravinder (generated)", id: "1518283014081-23") {
        addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "topic", constraintName: "FK_c975xs66f0v6extdjdl0csctr", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user")
    }

    changeSet(author: "ravinder (generated)", id: "1518283014081-24") {
        addForeignKeyConstraint(baseColumnNames: "resource_id", baseTableName: "topic_resources", constraintName: "FK_eae251lga1qm0xhhqw2dqiatg", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "resource")
    }

    changeSet(author: "ravinder (generated)", id: "1518283014081-25") {
        addForeignKeyConstraint(baseColumnNames: "resource_id", baseTableName: "resource_rating", constraintName: "FK_hmnf6fb69j5w3nttui4g372w9", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "resource")
    }

    changeSet(author: "ravinder (generated)", id: "1518283014081-26") {
        addForeignKeyConstraint(baseColumnNames: "resource_id", baseTableName: "user_resources", constraintName: "FK_iygtbioemc8ucik4wou4n0ho2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "resource")
    }

    changeSet(author: "ravinder (generated)", id: "1518283014081-27") {
        addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "user_resources", constraintName: "FK_n0jajce4ofrmt665xmyhvf5lp", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user")
    }

    changeSet(author: "ravinder (generated)", id: "1518283014081-28") {
        addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "resource_rating", constraintName: "FK_qae5oa07q1791tfyocrc7w995", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user")
    }

    changeSet(author: "ravinder (generated)", id: "1518283014081-29") {
        addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "reading_item", constraintName: "FK_rmxs9jrphvwn7tyg2n82p8wq0", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user")
    }

    changeSet(author: "ravinder (generated)", id: "1518283014081-30") {
        addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "subscription", constraintName: "FK_tq3cq3gmsss8jjyb2l5sb1o6k", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user")
    }

    changeSet(author: "ravinder (generated)", id: "1518283014081-31") {
        dropColumn(columnName: "account_expired", tableName: "user")
    }

    changeSet(author: "ravinder (generated)", id: "1518283014081-32") {
        dropColumn(columnName: "account_locked", tableName: "user")
    }

    changeSet(author: "ravinder (generated)", id: "1518283014081-33") {
        dropColumn(columnName: "password_expired", tableName: "user")
    }
}
