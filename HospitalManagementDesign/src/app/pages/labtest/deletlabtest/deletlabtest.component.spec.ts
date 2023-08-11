import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeletlabtestComponent } from './deletlabtest.component';

describe('DeletlabtestComponent', () => {
  let component: DeletlabtestComponent;
  let fixture: ComponentFixture<DeletlabtestComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DeletlabtestComponent]
    });
    fixture = TestBed.createComponent(DeletlabtestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
