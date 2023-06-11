CREATE TABLE studentinfo (
  `StudentID` INT NOT NULL,
  `Gender` VARCHAR(45) NULL,
  `EthnicGroup` VARCHAR(45) NULL,
  `LunchType` VARCHAR(45) NULL,
  `TestPrep` VARCHAR(45) NULL,
  `ParentMaritalStatus` VARCHAR(45) NULL,
  `PracticeSport` VARCHAR(45) NULL,
  `IsFirstChild` VARCHAR(45) NULL,
  `NrSiblings` INT NULL,
  `TransportMeans` VARCHAR(45) NULL,
  `MathScore` INT NULL,
  `ReadingScore` INT NULL,
  `WritingScore` INT NULL,
  PRIMARY KEY (`StudentID`));

/*
To add data to the table it is required to run the script at the top ->
-> right click on the table name in MySQL workbench -> 'Table Data Import Wizard' -> choose my csv file (Expanded_data_with_more_features1.csv)
and just click 'next' a few times
*/

SELECT * FROM studentinfo
GROUP BY StudentID;