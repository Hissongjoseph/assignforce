CREATE TABLE addresses (
    id int not null,
    name varchar(30),
    city varchar(30),
    state varchar(30),
    buildings array,
    isActive boolean
);

CREATE TABLE batches (
    id int not null,
    name varchar(30),
    startDate date,
    endDate date,
    curriculum int,
    trainer int,
    cotrainer int,
    size int,
    location int,
    building int,
    room int
);

CREATE TABLE buildings (
    id int,
    isActive boolean,
    address int,
    name varchar(30)
);

CREATE TABLE curricula (
    id int,
    name varchar(30),
    isActive boolean,
    isCore boolean,
);

CREATE TABLE events (
    id int,
    startDate date,
    endDate date,
    name varchar(30),
    created DATETIME,
    room int
);

CREATE TABLE rooms (
    id int,
    name varchar(30),
    active boolean,
    building int,
    capacity int
);

CREATE TABLE settings (
    id int,
    alias varchar(30),
    trainersPerPage int,
    reportGrads int,
    batchLength int,
    reportIncomingGrads int,
    minBatchSize int,
    maxBatchSize int,
    trainerBreakDays int,
    defaultLocation varchar(30),
    defaultBuilding varchar(30),
--     defaultNamePattern ??
);

CREATE TABLE skills (
    id int,
    name varchar(30),
    isActive boolean
);

CREATE TABLE trainers (
    firstName varchar(30),
    lastName varchar(30),
    email varchar(30),
    isActive boolean,
--  resume ??
    id int,
    preferredLocation int
);


